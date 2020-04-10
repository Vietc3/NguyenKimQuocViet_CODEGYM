import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ServiceService} from '../../../Services/service.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ContractDetailModule} from '../../../Models/contractDetail.module';
import {ServicesModule} from '../../../Models/services.module';

@Component({
  selector: 'app-edit-service',
  templateUrl: './edit-service.component.html',
  styleUrls: ['./edit-service.component.css']
})
export class EditServiceComponent implements OnInit {
public  serviceEdit:ServicesModule;
  public formAddNewServiceEdit:FormGroup;
  constructor(public formBuilderContractDetail:FormBuilder,
              public serviceEditService:ServiceService,
              public router:Router,public activatedRouteService: ActivatedRoute) { }

  ngOnInit(): void {
    this.formAddNewServiceEdit = this.formBuilderContractDetail.group({
      id:[],
      nameService:['', [Validators.required]],
      maxPeople:['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      feeRent:['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      idTypeRent:['', [Validators.required]],
      status:['', [Validators.required]],
      area: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      numberFloors: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.loadDataService()
  }
  loadDataService() {
    this.activatedRouteService.params.subscribe(data => {
      let id = data['id'];
      this.serviceEditService.getServiceEdit(id).subscribe((servicesModule:ServicesModule) => {
        this.serviceEdit = servicesModule;
        console.log(this.serviceEdit);
        console.log(this.formAddNewServiceEdit)
      });
    });
  }

  onEditService() {
// @ts-ignore
    this.serviceEditService.updateService(this.serviceEdit).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('service-list');
    });
  }
}

import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContracDetailsService} from '../../../Services/contrac-details.service';
import {Router} from '@angular/router';
import {ServiceService} from '../../../Services/service.service';

@Component({
  selector: 'app-add-service',
  templateUrl: './add-service.component.html',
  styleUrls: ['./add-service.component.css']
})
export class AddServiceComponent implements OnInit {

  public formAddNewService:FormGroup;
  constructor(public formBuilderContractDetail:FormBuilder,
              public service:ServiceService,
              public router:Router) { }

  ngOnInit(): void {
    this.formAddNewService = this.formBuilderContractDetail.group({
      id:[],
      nameService:['', [Validators.required]],
      maxPeople:['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      feeRent:['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      idTypeRent:['', [Validators.required]],
      status:['', [Validators.required]],
      area: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      numberFloors: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
  }
  addNewService(){

    this.service.addNewService(this.formAddNewService.value).subscribe(data=>{
      this.router.navigateByUrl('service-list');
      console.log(this.formAddNewService)
    })
  }

}

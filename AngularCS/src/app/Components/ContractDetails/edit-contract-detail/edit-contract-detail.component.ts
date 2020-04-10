import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContracDetailsService} from '../../../Services/contrac-details.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ContractsModule} from '../../../Models/contracts.module';
import {ContractDetailModule} from '../../../Models/contractDetail.module';

@Component({
  selector: 'app-edit-contract-detail',
  templateUrl: './edit-contract-detail.component.html',
  styleUrls: ['./edit-contract-detail.component.css']
})
export class EditContractDetailComponent implements OnInit {
public contractDetailEdit:ContractDetailModule;
  public formAddNewContractDetailEdit:FormGroup;

  constructor(public formBuilderContractDetail:FormBuilder,
              public contractDetailService:ContracDetailsService,
              public router:Router,
             public activatedRouteService: ActivatedRoute,) { }

  ngOnInit(): void {
    this.formAddNewContractDetailEdit = this.formBuilderContractDetail.group({
      id:[],
      idContract: ['', [Validators.required,Validators.pattern('^(HD)[\\-][0-9]{4}$')]],
      idServicePlus: ['', [Validators.required, Validators.pattern('^(DV)[\\-][0-9]{4}$')]],
      amount: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.loadDataContractDetailEdit()
  }
  loadDataContractDetailEdit() {
    this.activatedRouteService.params.subscribe(data => {
      let id = data['id'];
      this.contractDetailService.getContractDetailEdit(id).subscribe((contract:ContractDetailModule) => {
        this.contractDetailEdit = contract;
        console.log(this.contractDetailEdit);
        console.log(this.formAddNewContractDetailEdit)
      });
    });
  }

  onEditContractDetail() {
// @ts-ignore
    this.contractDetailService.updateContractDetail(this.contractDetailEdit).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('contractDetail-list');
    });
  }
}

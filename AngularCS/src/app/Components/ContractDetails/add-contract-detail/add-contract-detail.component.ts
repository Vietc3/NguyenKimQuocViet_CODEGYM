import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractsService} from '../../../Services/contracts.service';
import {Router} from '@angular/router';
import {ContracDetailsService} from '../../../Services/contrac-details.service';

@Component({
  selector: 'app-add-contract-detail',
  templateUrl: './add-contract-detail.component.html',
  styleUrls: ['./add-contract-detail.component.css']
})
export class AddContractDetailComponent implements OnInit {


  public formAddNewContractDetail:FormGroup;
  constructor(public formBuilderContractDetail:FormBuilder,
              public contractDetailService:ContracDetailsService,
              public router:Router) { }

  ngOnInit(): void {
    this.formAddNewContractDetail = this.formBuilderContractDetail.group({
      id:[],
      idContract: ['', [Validators.required,Validators.pattern('^(HD)[\\-][0-9]{4}$')]],
      idServicePlus: ['', [Validators.required, Validators.pattern('^(DV)[\\-][0-9]{4}$')]],
      amount: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
  }
  addNewContractDetail(){

    this.contractDetailService.addNewContractDetail(this.formAddNewContractDetail.value).subscribe(data=>{
      this.router.navigateByUrl('contractDetail-list');
      console.log(this.formAddNewContractDetail)
    })
  }


}

import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../Services/customer.service';
import {Router} from '@angular/router';
import {ContractsService} from '../../../Services/contracts.service';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {

  public formAddNewContract:FormGroup;
  constructor(public formBuilderContract:FormBuilder,
              public contractService:ContractsService,
              public router:Router) { }

  ngOnInit(): void {
    this.formAddNewContract = this.formBuilderContract.group({
      id:[],
      idEmployee: ['', [Validators.required,Validators.pattern('^(NV)[\\-][0-9]{4}$')]],
      idCustomer: ['', [Validators.required, Validators.pattern('^(KH)[\\-][0-9]{4}$')]],
      idService: ['', [Validators.required, Validators.pattern('^(DV)[\\-][0-9]{4}$')]],
      starDateContract: ['', [Validators.required]],
      endDateContract: ['', [Validators.required]],
      depositMoney: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      totalMoney: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],


    });
  }
  addNewContract(){

    this.contractService.addNewContract(this.formAddNewContract.value).subscribe(data=>{
      this.router.navigateByUrl('contract-list');
      console.log(this.formAddNewContract)
    })
  }


}

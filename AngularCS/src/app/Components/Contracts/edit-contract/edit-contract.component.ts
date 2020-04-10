import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractsService} from '../../../Services/contracts.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomersModel} from '../../../Models/customers.model';
import {ContractsModule} from '../../../Models/contracts.module';

@Component({
  selector: 'app-edit-contract',
  templateUrl: './edit-contract.component.html',
  styleUrls: ['./edit-contract.component.css']
})
export class EditContractComponent implements OnInit {
  public contractEdit:ContractsModule;
  public formAddNewContract1:FormGroup;
  constructor(public formBuilderContract:FormBuilder,
              public contractService:ContractsService,
              public router:Router,public activatedRouteService: ActivatedRoute,) { }

  ngOnInit(): void {
    this.formAddNewContract1 = this.formBuilderContract.group({
      id:[],
      idEmployee: ['', [Validators.required,Validators.pattern('^(NV)[\\-][0-9]{4}$')]],
      idCustomer: ['', [Validators.required, Validators.pattern('^(KH)[\\-][0-9]{4}$')]],
      idService: ['', [Validators.required, Validators.pattern('^(DV)[\\-][0-9]{4}$')]],
      starDateContract: ['', [Validators.required]],
      endDateContract: ['', [Validators.required]],
      depositMoney: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      totalMoney: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.loadDataContractEdit();
  }
  loadDataContractEdit() {
    this.activatedRouteService.params.subscribe(data => {
      let id = data['id'];
      this.contractService.getContractEdit(id).subscribe((contract:ContractsModule) => {
        this.contractEdit = contract;
        console.log(this.contractEdit);
        console.log(this.formAddNewContract1)
      });
    });
  }

  onEditContract() {
// @ts-ignore
    this.contractService.updateContract(this.contractEdit).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('contract-list');
    });
  }
}

import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../Services/customer.service';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeesModel} from '../../../Models/employees.model';
import {CustomersModel} from '../../../Models/customers.model';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  public customerEdit:CustomersModel;
  public formAddNewCustomer1:FormGroup;
  constructor(public formBuilderCustomer:FormBuilder,
              public customerService:CustomerService,
              public router:Router,
              public activatedRouteService: ActivatedRoute,) { }

  ngOnInit(): void {
    this.formAddNewCustomer1 = this.formBuilderCustomer.group({
      id:[],
      fullNameCustomer: ['', [Validators.required]],
      typeCustomer: ['', [Validators.required]],
      birthdayCustomer: ['', [Validators.required]],
      idCardCustomer: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      phoneNumberCustomer: ['', [Validators.required, Validators.pattern('^(090|091|([\\(]84[\\)][\\+]90)|([\\(]84[\\)][\\+]91))[0-9]{7}$')]],
      emailCustomer: ['', [Validators.required, Validators.email]],
      addressCustomer: ['', [Validators.required]],


    });
    this.loadDataCustomerEdit()
  }
  loadDataCustomerEdit() {
    this.activatedRouteService.params.subscribe(data => {
      let id = data['id'];
      this.customerService.getCustomerEdit(id).subscribe((customer:CustomersModel) => {
        this.customerEdit = customer;
        console.log(this.customerEdit);
        console.log(this.formAddNewCustomer1)
      });
    });
  }

  onEditCustomer() {
// @ts-ignore
    this.customerService.updateCustomer(this.customerEdit).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('customer-list');
    });
  }
}

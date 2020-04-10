import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {CustomerService} from '../../../Services/customer.service';

@Component({
  selector: 'app-add-customers',
  templateUrl: './add-customers.component.html',
  styleUrls: ['./add-customers.component.css']
})
export class AddCustomersComponent implements OnInit {

  public formAddNewCustomer:FormGroup;
  constructor(public formBuilderCustomer:FormBuilder,
              public customerService:CustomerService,
              public router:Router) { }

  ngOnInit(): void {
    this.formAddNewCustomer = this.formBuilderCustomer.group({
      id:[],
      fullNameCustomer: ['', [Validators.required]],
      typeCustomer: ['', [Validators.required]],
      birthdayCustomer: ['', [Validators.required]],
      idCardCustomer: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      phoneNumberCustomer: ['', [Validators.required, Validators.pattern('^(090|091|([\\(]84[\\)][\\+]90)|([\\(]84[\\)][\\+]91))[0-9]{7}$')]],
      emailCustomer: ['', [Validators.required, Validators.email]],
      addressCustomer: ['', [Validators.required]],


    });
  }
  addNewCustomer(){

    this.customerService.addNewCustomer(this.formAddNewCustomer.value).subscribe(data=>{
      this.router.navigateByUrl('customer-list');
      console.log(this.formAddNewCustomer)
    })
  }

}

import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, Validator, Validators} from '@angular/forms';
import {EmployeeService} from '../../../Services/employee.service';
import {Router} from '@angular/router';
@Component({
  selector: 'app-add-employees',
  templateUrl: './add-employees.component.html',
  styleUrls: ['./add-employees.component.css']
})
export class AddEmployeesComponent implements OnInit {
public formAddNewEmployee:FormGroup;
  constructor(public formBuilder:FormBuilder,
  public employeeService:EmployeeService,
              public router:Router) { }

  ngOnInit(): void {
    this.formAddNewEmployee = this.formBuilder.group({
      id:[],
      name: ['', [Validators.required]],
      position: ['', [Validators.required]],
      lever: ['', [Validators.required]],
      partitive: ['', [Validators.required]],
      birthDay: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\\(]84[\\)][\\+]90)|([\\(]84[\\)][\\+]91))[0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],

    });
  }
  addNewEmployee(){

    this.employeeService.addNewEmployee(this.formAddNewEmployee.value).subscribe(data=>{
   this.router.navigateByUrl('employee-list');
    console.log(this.formAddNewEmployee)
    })
  }

}

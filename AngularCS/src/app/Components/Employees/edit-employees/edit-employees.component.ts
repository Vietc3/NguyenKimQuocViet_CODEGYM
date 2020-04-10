import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validator, Validators} from '@angular/forms';
import {EmployeeService} from '../../../Services/employee.service';
import {Router, ActivatedRoute} from '@angular/router';
import {EmployeesModel} from '../../../Models/employees.model';

@Component({
  selector: 'app-edit-employees',
  templateUrl: './edit-employees.component.html',
  styleUrls: ['./edit-employees.component.css']
})
export class EditEmployeesComponent implements OnInit {

  public formAddNewEmployee1: FormGroup;
  public employeeEdit:EmployeesModel;

  constructor(public formBuilder: FormBuilder,
              public employeeService: EmployeeService,
              public router: Router,
              public activatedRouteService: ActivatedRoute,
  ) {
  }

  ngOnInit(): void {

    this.formAddNewEmployee1 = this.formBuilder.group({
      id:[''],
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
    this.loadData();

  }

  loadData() {
    this.activatedRouteService.params.subscribe(data => {
      let id = data['id'];
      this.employeeService.getEmployeeEdit(id).subscribe((employee:EmployeesModel) => {
        this.employeeEdit = employee;
        console.log(this.employeeEdit);
        console.log(this.formAddNewEmployee1)
      });
    });
  }

  onEdit() {
// @ts-ignore
    this.employeeService.updateEmployee(this.employeeEdit).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('employee-list');
    });
  }
}

import { Component, OnInit } from '@angular/core';
import {NotificationService} from '../../../Services/notification.service';
import {EmployeeService} from '../../../Services/employee.service';
import {DialogServiceService} from '../../../Services/dialog/dialog-service.service';
import {CustomerService} from '../../../Services/customer.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  public customers;
  public searchTermCustomer: string;
  public pCustomer: number = 1;
  constructor(private notificationService: NotificationService,
              public customerService: CustomerService,
              public dialogService: DialogServiceService) {
  }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe(data => {
      this.customers = data;
      console.log(this.customers);
    });
  }
  onDeleteCustomer(id: number) {
    // this.employeeService.deleteEmployee(id).subscribe(data => {
    //   this.updateAfterDelete(id);
    // });

    this.dialogService.openConfirmDialog('Are you sure to delete this decord?').afterClosed().subscribe(data => {
      console.log(data);
      if (data) {
        this.customerService.deleteCustomer(id).subscribe(data => {
          this.updateAfterDelete(id);
          this.notificationService.warn('Delete successfully');
        });
      }

    });
  }

  updateAfterDelete(id: number) {
    for (let i = 0; i < this.customers.length; i++) {
      if (this.customers[i].id === id) {
        this.customers.splice(i, 1);
        break;
      }
    }

  }


}

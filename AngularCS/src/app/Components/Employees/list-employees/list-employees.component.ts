import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../../Services/employee.service';
import {MatDialog} from '@angular/material/dialog';
import {MatConfirmDialogComponent} from '../../mat-confirm-dialog/mat-confirm-dialog.component';
import {DialogServiceService} from '../../../Services/dialog/dialog-service.service';
import {NotificationService} from '../../../Services/notification.service';


@Component({
  selector: 'app-list-employees',
  templateUrl: './list-employees.component.html',
  styleUrls: ['./list-employees.component.css']
})
export class ListEmployeesComponent implements OnInit {
  public employees;
  public searchTerm: string;
  public p: number = 1;

  constructor(private notificationService: NotificationService,
              public employeeService: EmployeeService,
              public dialogService: DialogServiceService) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployee().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    });
  }

  onDelete(id: number) {
    // this.employeeService.deleteEmployee(id).subscribe(data => {
    //   this.updateAfterDelete(id);
    // });

    this.dialogService.openConfirmDialog('Are you sure to delete this decord?').afterClosed().subscribe(data => {
      console.log(data);
      if (data) {
        this.employeeService.deleteEmployee(id).subscribe(data => {
          this.updateAfterDelete(id);
          this.notificationService.warn('Delete successfully');
        });
      }

    });
  }

  updateAfterDelete(id: number) {
    for (let i = 0; i < this.employees.length; i++) {
      if (this.employees[i].id === id) {
        this.employees.splice(i, 1);
        break;
      }
    }

  }

}

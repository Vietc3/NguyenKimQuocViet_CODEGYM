import { Component, OnInit } from '@angular/core';
import {NotificationService} from '../../../Services/notification.service';
import {ContracDetailsService} from '../../../Services/contrac-details.service';
import {DialogServiceService} from '../../../Services/dialog/dialog-service.service';
import {ServiceService} from '../../../Services/service.service';

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit {

  public services;
  public searchTermService: string;
  public pService: number = 1;
  constructor(private notificationService: NotificationService,
              public serviceService: ServiceService,
              public dialogService: DialogServiceService) {
  }

  ngOnInit(): void {
    this.serviceService.getAllService().subscribe(data => {
      this.services = data;
      console.log(this.services);
    });
  }


  onDeleteService(id: number) {
    // this.employeeService.deleteEmployee(id).subscribe(data => {
    //   this.updateAfterDelete(id);
    // });

    this.dialogService.openConfirmDialog('Are you sure to delete this decord?').afterClosed().subscribe(data => {
      console.log(data);
      if (data) {
        this.serviceService.deleteService(id).subscribe(data => {
          this.updateAfterDeleteService(id);
          this.notificationService.warn('Delete successfully');
        });
      }

    });
  }

  updateAfterDeleteService(id: number) {
    for (let i = 0; i < this.services.length; i++) {
      if (this.services[i].id === id) {
        this.services.splice(i, 1);
        break;
      }
    }


  }
}

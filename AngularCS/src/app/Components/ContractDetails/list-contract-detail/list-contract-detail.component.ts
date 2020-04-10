import { Component, OnInit } from '@angular/core';
import {NotificationService} from '../../../Services/notification.service';
import {ContractsService} from '../../../Services/contracts.service';
import {DialogServiceService} from '../../../Services/dialog/dialog-service.service';
import {ContracDetailsService} from '../../../Services/contrac-details.service';

@Component({
  selector: 'app-list-contract-detail',
  templateUrl: './list-contract-detail.component.html',
  styleUrls: ['./list-contract-detail.component.css']
})
export class ListContractDetailComponent implements OnInit {


  public contractDetails;
  public searchTermContractDetails: string;
  public pContractDetails: number = 1;
  constructor(private notificationService: NotificationService,
              public contractDetailService: ContracDetailsService,
              public dialogService: DialogServiceService) {
  }

  ngOnInit(): void {
    this.contractDetailService.getAllContractDetail().subscribe(data => {
      this.contractDetails = data;
      console.log(this.contractDetails);
    });
  }


  onDeleteContractDetail(id: number) {
    // this.employeeService.deleteEmployee(id).subscribe(data => {
    //   this.updateAfterDelete(id);
    // });

    this.dialogService.openConfirmDialog('Are you sure to delete this decord?').afterClosed().subscribe(data => {
      console.log(data);
      if (data) {
        this.contractDetailService.deleteContractDetail(id).subscribe(data => {
          this.updateAfterDeleteDetail(id);
          this.notificationService.warn('Delete successfully');
        });
      }

    });
  }

  updateAfterDeleteDetail(id: number) {
    for (let i = 0; i < this.contractDetails.length; i++) {
      if (this.contractDetails[i].id === id) {
        this.contractDetails.splice(i, 1);
        break;
      }
    }


  }
}

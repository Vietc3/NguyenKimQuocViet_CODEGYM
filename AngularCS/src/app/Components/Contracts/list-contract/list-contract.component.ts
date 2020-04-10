import { Component, OnInit } from '@angular/core';
import {NotificationService} from '../../../Services/notification.service';
import {ContractsService} from '../../../Services/contracts.service';
import {DialogServiceService} from '../../../Services/dialog/dialog-service.service';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {



  public contracts;
  public searchTermContract: string;
  public pContract: number = 1;
  constructor(private notificationService: NotificationService,
              public contractService: ContractsService,
              public dialogService: DialogServiceService) {
  }

  ngOnInit(): void {
    this.contractService.getAllContract().subscribe(data => {
      this.contracts = data;
      console.log(this.contracts);
    });
  }


  onDeleteContract(id: number) {
    // this.employeeService.deleteEmployee(id).subscribe(data => {
    //   this.updateAfterDelete(id);
    // });

    this.dialogService.openConfirmDialog('Are you sure to delete this decord?').afterClosed().subscribe(data => {
      console.log(data);
      if (data) {
        this.contractService.deleteContract(id).subscribe(data => {
          this.updateAfterDelete(id);
          this.notificationService.warn('Delete successfully');
        });
      }

    });
  }

  updateAfterDelete(id: number) {
    for (let i = 0; i < this.contracts.length; i++) {
      if (this.contracts[i].id === id) {
        this.contracts.splice(i, 1);
        break;
      }
    }


}
}

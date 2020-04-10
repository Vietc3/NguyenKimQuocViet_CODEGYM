import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {HomeComponent} from './Components/home/home.component';
import {PageNotFoundComponent} from './Components/page-not-found/page-not-found.component';
import {ListEmployeesComponent} from './Components/Employees/list-employees/list-employees.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {AddEmployeesComponent} from './Components/Employees/add-employees/add-employees.component';
import {EditEmployeesComponent} from './Components/Employees/edit-employees/edit-employees.component';
import {EmployeeComponent} from './Components/Employees/employee/employee.component';
import {MatDialogModule} from '@angular/material/dialog';
import {MatConfirmDialogComponent} from './Components/mat-confirm-dialog/mat-confirm-dialog.component';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CustomerComponent } from './Components/Customer/customer/customer.component';
import { ListCustomerComponent } from './Components/Customer/list-customer/list-customer.component';
import { AddCustomersComponent } from './Components/Customer/add-customers/add-customers.component';
import { EditCustomerComponent } from './Components/Customer/edit-customer/edit-customer.component';
import { ListContractComponent } from './Components/Contracts/list-contract/list-contract.component';
import { ContractComponent } from './Components/Contracts/contract/contract.component';
import { EditContractComponent } from './Components/Contracts/edit-contract/edit-contract.component';
import { AddContractComponent } from './Components/Contracts/add-contract/add-contract.component';
import { ContractdetailComponent } from './Components/ContractDetails/contractdetail/contractdetail.component';
import { EditContractDetailComponent } from './Components/ContractDetails/edit-contract-detail/edit-contract-detail.component';
import { AddContractDetailComponent } from './Components/ContractDetails/add-contract-detail/add-contract-detail.component';
import { ListContractDetailComponent } from './Components/ContractDetails/list-contract-detail/list-contract-detail.component';
import { ServiceComponent } from './Components/Services/service/service.component';
import { ListServiceComponent } from './Components/Services/list-service/list-service.component';
import { AddServiceComponent } from './Components/Services/add-service/add-service.component';
import { EditServiceComponent } from './Components/Services/edit-service/edit-service.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatNativeDateModule} from '@angular/material/core';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {
    path: 'employee-list', component: EmployeeComponent,
   children:[
     {path: '', component: ListEmployeesComponent},
     {path: ':id/edit', component: EditEmployeesComponent},
     {path: 'add', component: AddEmployeesComponent},
   ]
  },
  {
    path: 'customer-list', component: CustomerComponent,
    children:[
      {path: '', component: ListCustomerComponent},
      {path: ':id/edit', component: EditCustomerComponent},
      {path: 'add', component: AddCustomersComponent},
    ]
  },
  {
    path: 'contract-list', component: ContractComponent,
    children:[
      {path: '', component: ListContractComponent},
      {path: ':id/edit', component: EditContractComponent},
      {path: 'add', component: AddContractComponent},
    ]
  },
  {
    path: 'contractDetail-list', component: ContractdetailComponent,
    children:[
      {path: '', component: ListContractDetailComponent},
      {path: ':id/edit', component: EditContractDetailComponent},
      {path: 'add', component: AddContractDetailComponent},
    ]
  },
  {
    path: 'service-list', component: ServiceComponent,
    children:[
      {path: '', component: ListServiceComponent},
      {path: ':id/edit', component: EditServiceComponent},
      {path: 'add', component: AddServiceComponent},
    ]
  },

  {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    ListEmployeesComponent,
    AddEmployeesComponent,
    EditEmployeesComponent,
    EmployeeComponent,
    CustomerComponent,
    ListCustomerComponent,
    AddCustomersComponent,
    EditCustomerComponent,
    MatConfirmDialogComponent,
    ListContractComponent,
    ContractComponent,
    EditContractComponent,
    AddContractComponent,
    ContractdetailComponent,
    EditContractDetailComponent,
    AddContractDetailComponent,
    ListContractDetailComponent,
    ServiceComponent,
    ListServiceComponent,
    AddServiceComponent,
    EditServiceComponent,

  ],
  imports: [RouterModule.forRoot(routes),MatInputModule,MatNativeDateModule, MatDatepickerModule, MatSnackBarModule, CommonModule, Ng2SearchPipeModule, FormsModule, NgxPaginationModule, ReactiveFormsModule, MatDialogModule, MatIconModule, MatButtonModule, MatInputModule],
  exports: [RouterModule],
  entryComponents:[MatConfirmDialogComponent]
})
export class AppRoutingModule {
}

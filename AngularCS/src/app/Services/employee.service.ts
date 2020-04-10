import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
// @ts-ignore
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API: string = 'http://localhost:3000/employees';

  constructor(public http: HttpClient) {
  }

  getAllEmployee(): Observable<any> {
    return this.http.get(this.API);

  }
  getEmployeeEdit(id:number):Observable<any>{
    return this.http.get(`${this.API}/${id}`);
  }
  addNewEmployee(employee){
    return this.http.post(this.API,employee);

  }

  updateEmployee(employee):Observable<any>{
    return this.http.put(`${this.API}/${employee.id}`,employee)
  }

  deleteEmployee(id:number):Observable<any>{
    return this.http.delete(`${this.API}/${id}`)
  }
}

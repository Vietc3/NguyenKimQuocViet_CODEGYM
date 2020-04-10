import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  public API: string = 'http://localhost:3000/service';

  constructor(public http: HttpClient) {
  }

  getAllService(): Observable<any> {
    return this.http.get(this.API);

  }
  getServiceEdit(id:number):Observable<any>{
    return this.http.get(`${this.API}/${id}`);
  }
  addNewService(contract){
    return this.http.post(this.API,contract);

  }

  updateService(contract):Observable<any>{
    return this.http.put(`${this.API}/${contract.id}`,contract)
  }

  deleteService(id:number):Observable<any>{
    return this.http.delete(`${this.API}/${id}`)
  }}

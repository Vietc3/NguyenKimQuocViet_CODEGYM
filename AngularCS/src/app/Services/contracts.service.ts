import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContractsService {

  public API: string = 'http://localhost:3000/contract';

  constructor(public http: HttpClient) {
  }

  getAllContract(): Observable<any> {
    return this.http.get(this.API);

  }
  getContractEdit(id:number):Observable<any>{
    return this.http.get(`${this.API}/${id}`);
  }
  addNewContract(contract){
    return this.http.post(this.API,contract);

  }

  updateContract(contract):Observable<any>{
    return this.http.put(`${this.API}/${contract.id}`,contract)
  }

  deleteContract(id:number):Observable<any>{
    return this.http.delete(`${this.API}/${id}`)
  }
}

import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContracDetailsService {

  public API: string = 'http://localhost:3000/contractDetail';

  constructor(public http: HttpClient) {
  }

  getAllContractDetail(): Observable<any> {
    return this.http.get(this.API);

  }
  getContractDetailEdit(id:number):Observable<any>{
    return this.http.get(`${this.API}/${id}`);
  }
  addNewContractDetail(contract){
    return this.http.post(this.API,contract);

  }

  updateContractDetail(contract):Observable<any>{
    return this.http.put(`${this.API}/${contract.id}`,contract)
  }

  deleteContractDetail(id:number):Observable<any>{
    return this.http.delete(`${this.API}/${id}`)
  }
}

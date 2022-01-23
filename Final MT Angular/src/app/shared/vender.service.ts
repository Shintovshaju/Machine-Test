import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Vender } from './vender';

@Injectable({
  providedIn: 'root'
})
export class VenderService {

 //create an instance
 vender: Vender[];
 formData:Vender=new Vender();

 constructor(private httpClient: HttpClient) { }

 //get all employees
 getAllVenders() {
   this.httpClient.get(environment.apiUrl + "/api/venders")
     .toPromise().then(
       response =>
       this.vender = response as Vender[]
     );
 }

 //get a particular Employee
 getVender(venderId:number):Observable<any>{
   return this.httpClient.get(environment.apiUrl + "/api/venders/"+venderId);
 }
 //insert
 insertVender(vender:Vender):Observable<any>{
   return this.httpClient.post(environment.apiUrl + "/api/venders" ,vender);
 }

 //update
 updateVender(vender:Vender):Observable<any>{
   return this.httpClient.put(environment.apiUrl + "/api/venders" ,vender);
 }

 //delete
 deleteVender(venderId:number){

   this.httpClient.delete(environment.apiUrl + "/api/venders/"+venderId)
     .toPromise().then(
       response =>
       location.reload()
     );
     
 }
}

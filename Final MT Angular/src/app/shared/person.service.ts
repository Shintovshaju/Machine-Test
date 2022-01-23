import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Person } from './person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
 //create an instance
 person: Person[];
 formData:Person=new Person();

 constructor(private httpClient: HttpClient) { }

 //get all employees
 getAllContactPersons() {
   this.httpClient.get(environment.apiUrl + "/api/contacts")
     .toPromise().then(
       response =>
       this.person = response as Person[]
     );
 }

 //get a particular Employee
 getContactPerson(venderId:number):Observable<any>{
   return this.httpClient.get(environment.apiUrl + "/api/contacts/"+venderId);
 }
 //insert
 insertContactPerson(person:Person):Observable<any>{
   return this.httpClient.post(environment.apiUrl + "/api/contacts" ,person);
 }

 //update
 updateContactPerson(person:Person):Observable<any>{
   return this.httpClient.put(environment.apiUrl + "/api/contacts" ,person);
 }

 //delete
 deleteContactPerson(personId:number){

   this.httpClient.delete(environment.apiUrl + "/api/contacts/"+personId)
     .toPromise().then(
       response =>
       location.reload()
     );
     
 }

}

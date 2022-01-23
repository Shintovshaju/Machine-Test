import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/shared/person';
import { PersonService } from 'src/app/shared/person.service'

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.scss']
})
export class PersonListComponent implements OnInit {

//constructor injection
constructor(public personService:PersonService) { }

ngOnInit(): void {   //life cycle hook
  //get all appointment thru service and stores in employee array 
  this.personService.getAllContactPersons();
}

//implement populate form
//populate form by clicking the column fields
populateForm(person:Person){
  console.log(person);
  this.personService.formData=Object.assign({},person);
  
}

//update
updateContactPerson(personId:number){
  console.log(personId);
}

//delete
deleteContactPerson(personId:number){
  
  this.personService.deleteContactPerson(personId);
  
}

confirmDelete(personId:number){
  if(confirm("Do you want to delete this record?")){
    this.deleteContactPerson(personId);
  }
}

}

import { Component, OnInit } from '@angular/core';
import { Vender } from 'src/app/shared/vender';
import { VenderService } from 'src/app/shared/vender.service';

@Component({
  selector: 'app-vender-list',
  templateUrl: './vender-list.component.html',
  styleUrls: ['./vender-list.component.scss']
})
export class VenderListComponent implements OnInit {

//constructor injection
constructor(public venderService:VenderService) { }

ngOnInit(): void {   //life cycle hook
  //get all appointment thru service and stores in employee array 
  this.venderService.getAllVenders();
}

//implement populate form
//populate form by clicking the column fields
populateForm(vender:Vender){
  console.log(vender);
  this.venderService.formData=Object.assign({},vender);
  
}

//update
updateVender(venderId:number){
  console.log(venderId);
}

//delete
deleteVender(venderId:number){
  
  this.venderService.deleteVender(venderId);
  
}

confirmDelete(venderId:number){
  if(confirm("Do you want to delete this record?")){
    this.deleteVender(venderId);
  }
}

}

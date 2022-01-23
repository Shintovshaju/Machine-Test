import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PersonListComponent } from './persons/person-list/person-list.component';
import { PersonComponent } from './persons/person/person.component';
import { PersonsComponent } from './persons/persons.component';
import { VenderListComponent } from './venders/vender-list/vender-list.component';
import { VenderComponent } from './venders/vender/vender.component';
import { VendersComponent } from './venders/venders.component';

const routes: Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  { path: 'home', component: HomeComponent },
  { path: 'venders', component: VendersComponent },
  { path: 'vender', component: VenderComponent },
  { path: 'venderlist', component: VenderListComponent },
  { path: 'person', component: PersonComponent },
  { path: 'persons', component: PersonsComponent },
  { path: 'person-list', component: PersonListComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

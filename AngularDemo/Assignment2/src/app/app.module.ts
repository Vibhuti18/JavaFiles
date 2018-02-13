import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';
import { ToDoComponent }  from './todo.component';
import {todoComponent} from './todocomponent.component';
import { CompletedComponent } from './completed.component';
import { PendingComponent } from './pending.component';
import {RouterModule,Routes} from '@angular/router';
import {HttpClientModule} from '@angular/common/http'
import { MenuComponent } from './menu.component';
import { LoginComponent } from './login.component';
import { PageNotfoundComponent } from './pagenotfound.component';
import { WelcomeComponent } from './Welcome.component';
import { SummaryComponent } from './summary.component';
import { ProfileComponent } from './profile.component';


let routes:Routes=[
  {
    
      path:'',
      component:LoginComponent
    },

  {

  path:'login',
  component:LoginComponent
},

{
  
    path:'todolist',
    component:ToDoComponent
  },
  {
    path:'todolist/:uname',
    component:ToDoComponent,
    children:[
     
      {
        path:'completed',
        component:CompletedComponent
      },
      {
        path:'pending',
        component:PendingComponent
      }, 
      {
        path:'profile',
        component:ProfileComponent
        },      
    ]
  },

  {   path:'summary',
  component:SummaryComponent
},

  
    {   path:'**',
    component:PageNotfoundComponent
}
 ]

@NgModule({
  declarations: [
    AppComponent,ToDoComponent,todoComponent,CompletedComponent,
    PendingComponent,MenuComponent,WelcomeComponent,PageNotfoundComponent,LoginComponent,
    SummaryComponent,ProfileComponent
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule,RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

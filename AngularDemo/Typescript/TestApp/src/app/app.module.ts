import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { ProfileComponent } from './profile.component';
import { LoginComponent } from './login.component';
import { HeaderComponent } from './appheader.component';
import { ProductsComponent } from './Products.component';
import { PhotosComponent } from './photos.component';
import { CartComponent } from './cart.component';
import { MenuComponent } from './menu.component';
import {RouterModule,Routes} from '@angular/router';
import {WelcomeComponent} from './Welcome.component';
import { PageNotfoundComponent } from './pagenotfound.component';
import { LaptopComponent } from './laptop.component';
import { MobileComponent } from './mobile.component';
import { AllProductsComponent } from './allproducts.component';
import { ProductDetailComponent } from './productdetails.component';
import { SignUpFormComponent } from './signupform.component';
import { CamelCase } from './camelcase.pipe';
import { NumberPipe } from './numbercase.pipe';

let routes:Routes=[
  {
    path:'',
    component:WelcomeComponent
  },
  
  {

  path:'login',
  component:LoginComponent
},

  {
    path:'products',
    component:ProductsComponent,
    children:[
      {
        path:'',
        component:MobileComponent
      },
      {
        path:'laptops',
        component:LaptopComponent
      },
      {
        path:'mobiles',
        component:MobileComponent
      },
      
      {
        path:'allproducts',
        component:AllProductsComponent,
        children:[
          {
            path:'productdetails/:productId',
            component:ProductDetailComponent
          }

        ]
      }
    ]
  },

  {   path:'photos',
      component:PhotosComponent
    },
    {   path:'**',
    component:PageNotfoundComponent
  },

]

@NgModule({
  declarations: [
    AppComponent,ProfileComponent,LoginComponent,HeaderComponent,ProductsComponent,
    PhotosComponent,CartComponent,MenuComponent,WelcomeComponent,PageNotfoundComponent,
    MobileComponent,LaptopComponent,AllProductsComponent,ProductDetailComponent,
    SignUpFormComponent,CamelCase,NumberPipe
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule,RouterModule.forRoot(routes)],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

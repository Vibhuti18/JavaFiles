import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { WelcomeComponent } from './Welcome.component';
import { ProductsComponent } from './Products.component';
import { ProfileComponent } from './profile.component';
import { LoginComponent } from './login.component';
import { MobileProductcomponent } from './mobile-products.component';

@NgModule({
  declarations: [
    AppComponent,WelcomeComponent,ProductsComponent,LoginComponent,MobileProductcomponent,ProfileComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

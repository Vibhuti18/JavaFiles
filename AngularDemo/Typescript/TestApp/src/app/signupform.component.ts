import { Component, OnInit } from '@angular/core';
import {User1} from './User1';
@Component({
    selector:'userform',
    templateUrl: 'signupform.component.html',
    styles:[


        `
        input.ng-valid{
            border-left:solid 5px green;
        }

        input.ng-invalid{
            border-left:solid 5px red;
        }
        `
    ]
    
})
export class SignUpFormComponent  {
    user:User1 = {
            name : 'James',             
            phone:"1234",
            address:'India'
        
    }


    postForm():void{
        //HTTP Post request

        alert("Posted the form")
    }
 
}
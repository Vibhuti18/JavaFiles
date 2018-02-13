import { Injectable } from '@angular/core';
import {Subject} from 'rxjs/Subject';
import { Observable } from 'rxjs/Observable';
import { NewUser } from './NewUser';

@Injectable()
export class LoginService {

namesubj:Subject<NewUser>=new Subject<NewUser>();
    setUser(u1:NewUser):void{
this.namesubj.next(u1);
//next adds the name to the stream of bytes
    }


    getUser():Observable<NewUser>{
        //returns a stram of values
return this.namesubj.asObservable();
    }
}



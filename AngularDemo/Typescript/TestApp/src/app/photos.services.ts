import { Injectable } from '@angular/core';
import { photos } from './photos';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class PhotosService {

    photosArray:Array<photos>;
    constructor(private Http:HttpClient)
    {

        
        //injecting a service within a service
        
       
    }


    getPhotos():Observable<any>
    {
     return this.Http.get('https://jsonplaceholder.typicode.com/photos');
    }

    getPhotos2():Promise<any>
    {
     return this.Http.get('https://jsonplaceholder.typicode.com/photos').toPromise();
    }

}
import { Component, OnInit } from '@angular/core';
import { PhotosService } from './photos.services';
import { photos } from './photos';


@Component({
    selector: 'photo-name',
    template: `

    <h1>List of Photos</h1>
    <table>

    <tr *ngFor="let product of photos;let i=index;">
    <td><img src="{{product.thumbnailUrl}}"/></td>
    </tr>
    </table>

    
    
    `
    ,
    providers:[PhotosService]
})
export class PhotosComponent implements OnInit {
    photos:any;
    constructor(private photoservice:PhotosService) { }

    ngOnInit() { 

        // this.photoservice.getPhotos().subscribe(data=>{
        //     this.photos=data;
        // })


        this.photoservice.getPhotos2().then(data=>{
            this.photos=data;
        })
    }
}



// <td>{{product.albumId}}</td>
// <td>{{product.id}}</td>
// <td>{{product.title}}</td>
// <td>{{product.url}}</td>
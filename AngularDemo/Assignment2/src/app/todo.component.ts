import {Component} from '@angular/core';
import {Items} from './Items';
import {ToDoService} from './ToDoService.service'
import { ActivatedRoute } from '@angular/router';
import { LoginService } from './login.service';
import { NewUser } from './NewUser';

@Component({
    selector:'todo',
    template:`

    <h1>Welcome {{name}}</h1>

    <h1>To do List</h1>
    <a routerLink="completed">Completed Tasks</a>
    <a routerLink="pending">Pending Tasks</a>
    <a routerLink="/profile">profile</a>
    <router-outlet></router-outlet>
    <input (keyup.enter)="entered()" placeholder="Enter task"  #box="ngModel" [(ngModel)]="name" required>
    <p *ngIf="box.errors?.required">task title is mandatory field</p> 
    <table border="1">
    <th>UserId</th>
    <th>Id</th>
    <th>Title</th>
    <th>Done</th>
    <th>Action</th>
    <th>Delete</th>
    <tr *ngFor="let product of products;let i=index;">
    
    <td>{{product.userId}}</td>
    <td>{{product.id}}</td>
    <td>{{product.title}}</td>
    <td>{{product.completed}}</td>
    <td><button (click)="remove(i)">Delete</button></td>
    <td><input type="checkbox" (change)=markdone(i)/>MarkDone</td>
    </tr>
    </table>
    `,

    styles:
    [
        `
        img
        {
            height:100px;
            width:100px
        }

        input.ng-valid{
            border-left:solid 5px green;
        }

        input.ng-invalid{
            border-left:solid 5px red;
        }
        `

        
    ],
})

export class ToDoComponent
{
    products:Array<Items>;
    newItem:Items;
    name:string;
    nu:NewUser;
    
    

    constructor(private tds:ToDoService,private activeroute:ActivatedRoute,private changeservice:LoginService)
    {
        
    }

    ngOnInit() {
        //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
        //Add 'implements OnInit' to the class.
        // this.tds.getPhotos().subscribe(newname=>{
        //     //this is a lambda expression which handles the new name that arrives
        //     this.title=newname.title;
        //     this.comp=newname.completed;
        // });


        this.activeroute.params.subscribe(routeParams=>{
            this.name=routeParams['uname'];
            //this.nu.username=this.name;
        });

        this.tds.getItems().subscribe(data=>{
            this.products=data;
        })

        this.changeservice.getUser().subscribe(data=>{
            this.nu=data;
            this.name=this.nu.username;
        })
    }


    entered():void{

        let userObj=new Items(1,1000,this.name,false);
        this.products.push(userObj);
      this.tds.postItem(userObj);

    }

    
     markdone(index:number):void{
        if(this.products[index].completed==false)
        this.products[index].completed=true;
        else
        this.products[index].completed=false;
  }

    remove(index:number):void{
        this.products.splice(index,1);
    }
/*

    validate(searchstr:string):void{
        console.log(searchstr);
    } */
}

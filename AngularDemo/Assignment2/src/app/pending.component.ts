import { Component, OnInit,Input } from '@angular/core';
import { Items } from './Items';
import { ToDoService } from './ToDoService.service';

@Component({
    selector: 'pending',
    template: `
    
    <h2>Pending Tasks</h2>
    <table border="1">
    <th>Title</th>
    <th>Done</th>
    <th>Creation Date</th>
    <th>Due Date</th>
    <tr *ngFor="let product of found;let i=index;">
    <td>{{product.userId}}</td>
    <td>{{product.id}}</td>
    <td>{{product.title}}</td>
    <td>{{product.completed}}</td>
    </tr>
    </table>

    `,
    providers:[{provide:ToDoService,useClass:ToDoService}]

})
export class PendingComponent implements OnInit {
    @Input()
    
    products:Items[]=[];
    found:Items[]=[];
    constructor(private tds:ToDoService) {
        
       }

    ngOnInit() { 


        this.tds.getItems().subscribe(data=>{
            this.products=data;
            this.products.forEach(element => {
                if(element.completed===false)
                {
                    this.found.push(element);
                }
            });
            console.log(this.found);
        })
        
    }

    
}
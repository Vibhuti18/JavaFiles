import { Component, OnInit } from '@angular/core';
import { ToDoService } from './ToDoService.service';
import { Items } from './Items';

@Component({
    selector: 'summary',
    template: `<h1>The number of tasks are {{count}} </h1>`,
    
})

export class SummaryComponent implements OnInit {
    products:Items[]=[]
    count:number;
    constructor(private tds:ToDoService) { }

    ngOnInit() { this.tds.getItems().subscribe(data=>{
        this.products=data;
    this.count=this.products.length;
    })}
}
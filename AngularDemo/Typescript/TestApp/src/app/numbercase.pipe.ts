import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'numberpipe'})
export class NumberPipe implements PipeTransform {
    transform(value: number): any {
       
       let f_val = value.replace(/\D[^\.]/g, "");
       let value1 = f_val.slice(0,3)+"-"+f_val.slice(3,6)+"-"+f_val.slice(6);
        return value1;
        
    }
}
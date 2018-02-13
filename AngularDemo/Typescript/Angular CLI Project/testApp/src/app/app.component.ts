import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: `
  
  <h1>Name in appcomponent: {{name}} </h1>
  <profile></profile>
  
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name = 'Jane';
}

import { Component, OnInit } from '@angular/core';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'component-to-view',
  templateUrl: './component-to-view.component.html',
  styleUrls: ['./component-to-view.component.css']
})
export class ComponentToViewComponent implements OnInit {
public name: string =  'Nguyễn Kim Quốc Việt';
public age: number = 18;
public isMarried: boolean  = false;
public isDisableButton: boolean  = true;
public isDisableTable: boolean  = true;
public isCheck: number  = 2;
public imgLink: string  = 'https://kenh14cdn.com/2019/5/14/5587267925354223366844883628721449536668784n-15576238621521859483428-15578502417451816708793.jpg';
public user: any = {
  name: 'Nguyễn Kim Quốc Nam',
  age: 30,
  married: true
};


  constructor() { }

  ngOnInit(): void {
  }
  showInfor(){
    return `name: ${this.user['name']}`;
  }

}

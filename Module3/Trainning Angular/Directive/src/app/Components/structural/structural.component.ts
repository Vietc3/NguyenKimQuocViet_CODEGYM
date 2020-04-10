import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  public userName: string = 'Nguyễn Kim Quốc Việt';
  public age: number;
  public isShow: boolean = false;
  public isCheck: boolean = false;
  public names: string [] = ['Nguyễn Kim Quốc việt','Nam', "Khánh"];
public product:any[]=[
]
  public productFormSever:any[]=[{
    id:1,
    name:"iP11",
    img :"https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-red-400x400.jpg"
  },
    {
      id:2,
      name:"iP6",
      img :"https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-red-400x400.jpg"
    },
    {
      id:3,
      name:"iP7",
      img :"https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-red-400x400.jpg"
    },
    {
      id:4,
      name:"iP8",
      img :"https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-red-400x400.jpg"
    }
  ]
  constructor() {
  }

  ngOnInit(): void {
  }

  toggle() {
    this.isShow = !this.isShow;
  }

  onChange(value) {
    // tslint:disable-next-line:no-unused-expression
    this.isCheck = value;
  }
  onLoadData(){
  this.product=this.productFormSever;
  }
  myTrackingFunction(index,item){
  return item.id;
  }
}

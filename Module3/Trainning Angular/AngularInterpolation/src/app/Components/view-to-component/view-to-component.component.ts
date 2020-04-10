import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'view-to-component',
  templateUrl: './view-to-component.component.html',
  styleUrls: ['./view-to-component.component.css']
})
export class ViewToComponentComponent implements OnInit {
  public title: string = 'Event Binding';
  public userName: string;
  public count: number = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  onClickMe() {
    alert('Hello');
  }

  onClickCount() {
    let count;
    this.count = this.count + 1;
  }

  onKeyUp(event) {
    // console.log(event.target.value);
    this.userName = event.target.value;
  }

  onKeyUpEnter(event) {
    // console.log(event.target.value);
    this.userName = event.target.value;
  }}

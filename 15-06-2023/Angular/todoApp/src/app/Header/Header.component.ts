import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-Header',
  templateUrl: './Header.component.html',
  styleUrls: ['./Header.component.css']
})
export class HeaderComponent implements OnInit {

  displayFlag: boolean = true;

  constructor() { }

  ngOnInit() {
  }

  onClick(){

    if(this.displayFlag==true)
    {
      this.displayFlag = false;
    }else{
      this.displayFlag = true;
    }

    return this.displayFlag;
  }

}

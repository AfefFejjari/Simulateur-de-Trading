import { Component, OnInit } from '@angular/core';
import { OrderService } from 'src/app/services/order.service';


@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {

  constructor(private orderService: OrderService) { }
  dataSource : any ;
  ngOnInit() {

  
  this.orderService.getOrders()
  .subscribe(data =>{this.dataSource = data;
    for (var _i = 0; _i < this.dataSource.length; _i++) {
      this.dataSource[_i].transaction= this.dataSource[_i].transactionType+' at '+ this.dataSource[_i].orderType;
this.dataSource[_i].targetPrice= this.dataSource[_i].limitPrice;
   this.dataSource[_i].asset= this.dataSource[_i].asset.symbol;
this.dataSource[_i].state= this.dataSource[_i].state;



}

console.log("success")});
}


  
  }



import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private orderUrl="http://localhost:8484/api/test/order";
  private createorder="http://localhost:8484/api/test/createorder";

  constructor(private http: HttpClient) { }

  order(form :any){
    return this.http.post(this.createorder,{
          "assetSymbol": form.assetSymbol,
         
          "transactionType":form.transactionType,
          "quantity":form.quantity,
    "orderType":form.orderType,
    "marketPrice":form.marketPrice,
    "limitPrice":form.limitPrice,
    "stopPrice":form.stopPrice,
    "duration":form.duration,
    "userId":localStorage.getItem('UserId'),
    
    }).pipe(map(data =>{console.log("order created successfully")}));
            }

  getOrders(){
    return this.http.get(this.orderUrl,{ responseType: 'text' });
}
}

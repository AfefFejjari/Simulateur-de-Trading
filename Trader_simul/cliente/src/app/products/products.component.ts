import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  Products: any;
  constructor(private http: HttpClient) { }

  ngOnInit() {
	this.http.get('/get').subscribe(data => {
    this.Products=data;
  });
  }

}

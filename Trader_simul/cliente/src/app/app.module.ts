import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './APP-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/HTTP';
import { RouterModule, Routes } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { BuyProductComponent } from './buy-product/buy-product.component';

const appRoutes: Routes = [
  {
    path: 'contact',
    component: ProductsComponent,
    data: { title: 'Product List' }
  },
  { path: '',
    redirectTo: '/get',
    pathMatch: 'full'
  },
 {
    path: '',
    component: BuyProductComponent,
    data: { title: 'Buy product' }
  },
];
@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    BuyProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
 RouterModule.forRoot(
    appRoutes,
    { enableTracing: true } // <-- debugging purposes only
  )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

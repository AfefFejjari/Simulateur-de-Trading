import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { httpInterceptorProviders } from './auth/auth-interceptor';
import { UserComponent } from './user/user.component';
import { AdminComponent } from './admin/admin.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TopnavbarComponent } from './layout/topnavbar/topnavbar.component';
import { FooterComponent } from './layout/footer/footer.component';
import { SettingnavbarComponent } from './layout/settingnavbar/settingnavbar.component';
import { AsidnavbarComponent } from './layout/asidnavbar/asidnavbar.component';
import { StockComponent } from './order/stock/stock.component';
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AdminComponent,
    LoginComponent,
    RegisterComponent,
    DashboardComponent,
    TopnavbarComponent,
    FooterComponent,
    SettingnavbarComponent,
    AsidnavbarComponent,
    StockComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  exports: [
  TopnavbarComponent,
   FooterComponent,
   SettingnavbarComponent,
   AsidnavbarComponent
  ],
  providers: [httpInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }

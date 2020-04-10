import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponentToViewComponent } from './Components/component-to-view/component-to-view.component';
import { ViewToComponentComponent } from './Components/view-to-component/view-to-component.component';
import { TwoWayBindingComponent } from './Components/two-way-binding/two-way-binding.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponentToViewComponent,
    ViewToComponentComponent,
    TwoWayBindingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

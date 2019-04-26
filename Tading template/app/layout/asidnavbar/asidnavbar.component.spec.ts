import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsidnavbarComponent } from './asidnavbar.component';

describe('AsidnavbarComponent', () => {
  let component: AsidnavbarComponent;
  let fixture: ComponentFixture<AsidnavbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsidnavbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsidnavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

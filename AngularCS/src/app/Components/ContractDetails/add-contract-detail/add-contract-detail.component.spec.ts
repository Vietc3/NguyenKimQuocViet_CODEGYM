import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddContractDetailComponent } from './add-contract-detail.component';

describe('AddContractDetailComponent', () => {
  let component: AddContractDetailComponent;
  let fixture: ComponentFixture<AddContractDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddContractDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddContractDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

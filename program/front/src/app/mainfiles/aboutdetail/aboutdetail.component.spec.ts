import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutdetailComponent } from './aboutdetail.component';

describe('AboutdetailComponent', () => {
  let component: AboutdetailComponent;
  let fixture: ComponentFixture<AboutdetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AboutdetailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AboutdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { Component, OnInit } from '@angular/core';
import {CdkTextareaAutosize} from '@angular/cdk/text-field';
import { NgZone, ViewChild} from '@angular/core';
import {take} from 'rxjs/operators';
@Component({
  selector: 'app-demographic-form',
  templateUrl: './demographic-form.component.html',
  styleUrls: ['./demographic-form.component.css']
})
export class DemographicFormComponent implements OnInit {

  constructor(private _ngZone: NgZone) {}
  ngOnInit(): void {
  }
  @ViewChild('autosize') autosize!: CdkTextareaAutosize;

  
}

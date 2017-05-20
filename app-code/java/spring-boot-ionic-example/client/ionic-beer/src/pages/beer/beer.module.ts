import{NgModule}from'@angular/core';
import {IonicPageModule }from 'ionic-angular';
import {BeerPage }from './beer';
import { BeerModalPage } from './beer-modal';

import { BeerService } from '../../providers/beer-service';
import { GiphyService } from '../../providers/giphy-service';


@NgModule({
  declarations: [
    BeerPage,
    BeerModalPage
  ],
  imports: [
    IonicPageModule.forChild(BeerPage),
  ],
  exports: [
    BeerPage
  ],
  providers: [
    BeerService,
    GiphyService
  ],
  entryComponents: [
    BeerModalPage
  ]

})
export class BeerPageModule {}

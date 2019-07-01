import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Materia } from 'src/app/core/entities/materia/materia';
import { MateriaService } from 'src/app/core/entities/materia/materia.service';


@Injectable()
export class MateriaResolver implements Resolve<Materia []> {

    constructor(private service: MateriaService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}

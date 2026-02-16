import { Autor } from "./autor.model"
import { Categoria } from "./categoria.model"

export interface Libro{
    idLibro: number
    titulo: string
    editorial: string
    numpaginas: number
    edicion :string
    idioma: string
    fechapublicacion: Date
    descripcion: string
    tipodepasta: string
    isbn: String
    numejemplares: number
    portada: string
    presentacion: string
    precio: number
    categoria: Categoria
    autor: Autor

    [key: string]: any;
}
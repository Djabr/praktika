//
//  hdsApp.swift
//  Shared
//
//  Created by Джабраил Хасбулатов on 18.12.2021.
//

import SwiftUI

@main
struct hdsApp: App {
    var body: some Scene {
        DocumentGroup(newDocument: hdsDocument()) { file in
            ContentView(document: file.$document)
        }
    }
}

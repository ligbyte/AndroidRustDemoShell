#! /bin/bash
cargo ndk -t armeabi-v7a -t arm64-v8a -o ../src/main/jniLibs build  --release